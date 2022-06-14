// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XGravityEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("event"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window"),
        Constants$root.C_INT$LAYOUT.withName("x"),
        Constants$root.C_INT$LAYOUT.withName("y")
    );
    public static MemoryLayout $LAYOUT() {
        return XGravityEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XGravityEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XGravityEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XGravityEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XGravityEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XGravityEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XGravityEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XGravityEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XGravityEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XGravityEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XGravityEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XGravityEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XGravityEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XGravityEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XGravityEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XGravityEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XGravityEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XGravityEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XGravityEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XGravityEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XGravityEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("event"));
    public static VarHandle event$VH() {
        return XGravityEvent.event$VH;
    }
    public static long event$get(MemorySegment seg) {
        return (long)XGravityEvent.event$VH.get(seg);
    }
    public static void event$set( MemorySegment seg, long x) {
        XGravityEvent.event$VH.set(seg, x);
    }
    public static long event$get(MemorySegment seg, long index) {
        return (long)XGravityEvent.event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void event$set(MemorySegment seg, long index, long x) {
        XGravityEvent.event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XGravityEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XGravityEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XGravityEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XGravityEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XGravityEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XGravityEvent.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XGravityEvent.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XGravityEvent.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XGravityEvent.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XGravityEvent.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XGravityEvent.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XGravityEvent.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XGravityEvent.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XGravityEvent.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XGravityEvent.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


